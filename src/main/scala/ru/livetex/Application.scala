/**
 * Prolog analog:
 * 
 * Prolog Script:
 * child(john, carl).
 * child(carl, tom).
 * 
 * grandchild(A, B):-
 *   child(A, X),
 *   child(X, B).
 * 
 * Prolog Console:
 * | ?- grandchild(john, tom).
 *
 * yes
 * 
 * 
 * | ?- grandchild(carl, tom).
 *
 * no
 */
object Application extends App {

  trait John
  trait Carl
  trait Tom

  trait Child[P, C]
  trait GrandChild[GP, GC]

  implicit val johnIsCarlFather = new Child[John, Carl] {}
  implicit val carlIsTomFather = new Child[Carl, Tom] {}

  implicit def grandChild[X, Y, Z](implicit xy: Child[X, Y], yz: Child[Y, Z]) =
    new GrandChild[X, Z] {}

  // compile
  implicitly[GrandChild[John, Tom]]

  // not compile
  // implicitly[GrandChild[Carl, Tom]]

}
