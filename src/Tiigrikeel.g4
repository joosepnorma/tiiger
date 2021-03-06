grammar Tiigrikeel;

programm
    :   '\n'* lauseteJada ('\n'+ lauseteJada)* '\n'*
    ;

lauseteJada
    :   lause ('\n' lause)*
    ;

lause
    :   kuiLause
    |   kuniLause
    |   omistamine
    |   uusFunktsioon
    |   avaldis
    |   '{' lauseteJada '}'
    ;

kuiLause
    :   'kui' '(' lausearvutus ')' ':' '\n' lauseteJada '\n'?
    |   'kui' '(' lausearvutus ')' ':' lause
    |   'kui' lausearvutus ':' '\n' lauseteJada '\n'?
    |   'kui' lausearvutus ':' lause
    ;

kuniLause
    :   'kuni' '(' lausearvutus ')' ':' '\n' lauseteJada '\n'?
    |   'kuni' '(' lausearvutus ')' ':' lause
    |   'kuni' lausearvutus ':' '\n' lauseteJada '\n'?
    |   'kuni' lausearvutus ':' lause
    ;

omistamine
    :   MuutujaNimi '=' avaldis
    |   tehe1 '=' avaldis
    ;

uusFunktsioon
    :   'tegevus' MuutujaNimi '(' (MuutujaNimi (',' MuutujaNimi)*)? ')' ':' '\n' lauseteJada
    ;

avaldis
    :   hulk
    |   lausearvutus
    |   tehe
    ;

tehe
    :   tehe4
    ;

tehe4
    :   tehe4 ('+'|'-') tehe3                               #LiitmineLahutamine
    |   tehe3                                               #TriviaalneTehe4
    ;

tehe3
    :   tehe3 ('*'|'/') tehe2                               #KorrutamineJagamine
    |   tehe2                                               #TriviaalneTehe3
    ;

tehe2
    :   '-' tehe2                                           #UnaarneMiinus
    |   tehe1                                               #TriviaalneTehe2
    ;

tehe1
    :   MuutujaNimi '(' (avaldis (',' avaldis)*)? ')'       #Funktsioon
    |   MuutujaNimi '[' tehe ']'                            #JärjendiFunktsioon
    |   '(' tehe ')'                                        #SulustatudTehe
    |   tehe0                                               #TriviaalneTehe1
    ;

tehe0
    :   Tõeväärtus                                          #TõeväärtusR1
    |   MuutujaNimi                                         #MuutujaNimiR
    |   Täisarv                                             #TäisarvR
    |   Komaga                                              #KomagaR
    |   Sõne                                                #SõneR
    ;

lausearvutus
    :   lausearvutus4
    ;

lausearvutus4
    :   lausearvutus4 'või' lausearvutus3                   #Disjunktsioon
    |   lausearvutus3                                       #TriviaalneLausearvutus3
    ;

lausearvutus3
    :   lausearvutus3 'ja' lausearvutus2                    #Konjunktsioon
    |   lausearvutus2                                       #TriviaalneLausearvutus2
    ;

lausearvutus2
    :   '!' lausearvutus2                                   #Eitus
    |   '(' lausearvutus ')'                                #SulustatudLausearvutus
    |   Tõeväärtus                                          #TõeväärtusR
    |   lausearvutus1                                       #TriviaalneLausearvutus1
    ;

lausearvutus1
    :   tehe ('>'|'<'|'>='|'<='|'=='|'!=') tehe             #Võrdlus
    |   lausearvutus0                                       #TriviaalneLausearvutus0
    ;

lausearvutus0
    :   MuutujaNimi
    ;

hulk
    :   '(' (avaldis (',' avaldis)*)? ')'
    ;

Tõeväärtus
    :   'jah'
    |   'ei'
    ;

MuutujaNimi
    :   [a-zA-Z][a-zA-Z0-9_]*
    ;

Täisarv
    :   '0'|[1-9][0-9]*
    ;

Komaga
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)
    ;

Sõne
    :   '"' ~["\n\r]* '"'
    ;

Kommentaar
    :   '/*' .*? '*/' -> skip
    ;

Whitespace
    :   [ \t] -> skip
    ;