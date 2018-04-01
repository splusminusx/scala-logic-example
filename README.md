# Scalalog

Scala compiler as simple logic programming system.

## Example Prolog facts and rules.

```prolog

%facts
child(john, carl).
child(carl, tom).

%riles
grandchild(A, B):-
  child(A, X),
  child(X, B).

```

## Prolog queries

```prolog
| ?- grandchild(carl, tom). 

no

| ?- grandchild(john, tom).

yes
```

## Links
- [Be Like Water — A Shapeless Primer](https://speakerdeck.com/evacchi/be-like-water-a-shapeless-primer)
- [Execute Prolog Online](http://www.tutorialspoint.com/execute_prolog_online.php)
- [densh/typelog](https://github.com/densh/typelog) - Typelog: type-level programming for mere mortals
