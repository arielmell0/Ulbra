public class Lista {
  Elemento inicio;
  int quantidade;
  Elemento fim;
  Elemento dados = inicio;

  public void esvaziar() {
    inicio = null;
    quantidade = 0;
    fim = null;
  }

  public void addInicio(Elemento e) {
    if (inicio == null) {
      inicio = e;
      quantidade++;
      fim = e;
    } else {
      e.prox = inicio;
      inicio = e;
      quantidade++;

    }
  }

  public void removerInicio() {
    if (inicio == null) {
      System.out.println("A lista está vazia. Não há elementos para remover.");
    } else {
      inicio = inicio.prox;
      quantidade--;
      if (inicio == null) {
        fim = null;
      }
    }
  }

  public void addFim(Elemento e) {
    if (inicio == null) {
      inicio = e;
      quantidade++;
      fim = e;
    } else {
      fim.prox = e;
      fim = e;
      quantidade++;

    }
  }

  public void removerDoFim() {
    if (inicio == null) {
      System.out.println("A lista está vazia. Não há elementos para remover.");
    } else if (inicio == fim) {
      inicio = null;
      fim = null;
      quantidade--;
    } else {
      Elemento anterior = inicio;
      Elemento atual = inicio.prox;
      while (atual.prox != null) {
        anterior = atual;
        atual = atual.prox;
      }
      anterior.prox = null;
      fim = anterior;
      quantidade--;
    }
  }

  public void mostrarLista() {
    System.out.println();
    for (Elemento e = inicio; e != null; e = e.prox) {
      System.out.println(e.dado);
    }

  }

  public void mostrarPrimeiro() {
    System.out.println(inicio.dado);
  }

  public void mostrarUltimo() {
    System.out.println(fim.dado);
  }

  public int obterElementoNaPosicao(int posicao) {
    if (posicao < 0 || posicao >= quantidade) {
      throw new IndexOutOfBoundsException("Posição inválida na lista.");
    }

    Elemento elementoAtual = inicio;
    for (int i = 0; i < posicao; i++) {
      elementoAtual = elementoAtual.prox;
    }

    return elementoAtual.dado;
  }

}