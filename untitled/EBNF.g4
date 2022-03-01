grammar EBNF;
prules:	(expr)* ;
expr:	('+'|'-')' 'expr' 'term
    |   term;

term:('*'|'/')' 'term' 'factor
    |   factor ;

factor: '('expr')'
    | INT
    | INT'.'INT
    | '('INT'.'expr')'
    ;

INT     : [0-9]+ ;
