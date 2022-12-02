class Article {
  int titleId;
  String title;
  String author;

  public Article(int i, String t, String a) {
    titleId = i;
    title = t;
    author = a;
  }

  public String toString() {
    return String.format("\t %d | %s | %s -->\n", titleId, title, author);
  }
}

/*
public class Node<E> {
  E element;
  Node<E> next;

  public Node(E e) {
    element = e;
  }

  public String toString() {
    return "" + element;
  }
}
*/
