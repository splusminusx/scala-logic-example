# Scala Typelevel logic example

## Пример фактов и правил в Prolog

```prolog

%facts
child(john, carl).
child(carl, tom).

%riles
grandchild(A, B):-
  child(A, X),
  child(X, B).

```

## Пример запроса в Prolog

```prolog
| ?- grandchild(carl, tom). 

no

| ?- grandchild(john, tom).

yes
```
