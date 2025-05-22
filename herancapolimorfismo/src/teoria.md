✅ Resumo Didático: final e Classes Abstratas em Java
🔐 Palavra-chave final
Em Java, final é usada para proteger ou travar algo. Veja como funciona em cada caso:

Onde usar?	Pode usar?	O que faz? 🌟 Explicação simples
Classe	✅, Sim,	Impede herança → Ninguém pode estender essa classe.
Método	✅, Sim,	Impede sobrescrita → O método não pode ser modificado nas subclasses.
Atributo	✅, Sim,	Torna constante → O valor não pode mudar depois que for definido.

🧱 Classe Abstrata
Uma classe abstrata é como um molde ou modelo que serve para outras classes seguirem. Ela não pode ser usada diretamente, mas serve como base para herança.

🧠 Por que usar?
Use uma classe abstrata quando:

Você quer compartilhar código comum entre várias classes.

Mas também quer forçar as subclasses a implementarem alguns métodos específicos.

🛠️ Características das Classes Abstratas
Característica	Explicação simples
❌ Não pode ser instanciada	Você não pode criar objetos diretamente de uma classe abstrata.
✅ Pode ter métodos abstratos	Métodos sem corpo, que devem ser implementados pelas subclasses.
✅ Pode ter métodos concretos	Métodos com código pronto, que podem ser usados pelas subclasses.
✅ Pode ter atributos e construtores	Atributos e construtores funcionam normalmente, e o construtor é chamado via super().

🧪 Exemplo Prático
public abstract class Animal {
// Método abstrato (sem corpo)
public abstract void fazerSom();

    // Método concreto (com código)
    public void dormir() {
        System.out.println("Zzz...");
    }
}

public class Cachorro extends Animal {
@Override
public void fazerSom() {
System.out.println("Au au!");
   }
}

public class Teste {
public static void main(String[] args) {
// Animal a = new Animal(); // ❌ ERRO: não pode instanciar classe abstrata
Animal meuCachorro = new Cachorro(); // ✅ Ok!
meuCachorro.fazerSom(); // "Au!"
meuCachorro.dormir();   // "Zzz..."
   }
}


📝 Dica Final
Use ‘abstract’ quando quiser forçar subclasses a implementar algum comportamento.

Use final quando quiser proteger um método, atributo ou classe contra mudanças.


avaliar se os cenarios seguintes são possiveis em oo e em java:

a) A<-B/C  
b)A/B <-C 
c)A<-B<-C  
d)IA<- - -A 
e)A<- - - IA
f)A<-IA  
g)IA<-B 
h)AI<-IB 
i)IA<- - -IB
j)B<-A/- - IA/- - IB 
k)IA<- - A/ - - B
h) A<-A
m)B dentrro de A

- extends
- - - implements
      Vamos avaliar cada cenário, analisando se é possível ou não em orientação a objetos (OO) e em Java, com base nas regras de herança (extends) e implementação de interfaces (implements).

💡 Notação:

A <- B = B herda (estende) A (class B extends A)

A <- - - IA = A implementa IA (class A implements IA)

IA e IB = Interfaces

A, B, C = Classes

"dentro de" = classe interna

| Letra | Interpretação                           | OO? | Java? | Comentário                                                                                |
| ----- | --------------------------------------- | --- | ----- | ----------------------------------------------------------------------------------------- |
| a)    | **B e C herdam A**                      | ✅   | ✅     | Herança de uma mesma superclasse por várias subclasses é válida.                          |
| b)    | **C herda de A e B (herança múltipla)** | ✅   | ❌     | OO permite herança múltipla de classes, mas Java não permite (`extends A, B` é inválido). |
| c)    | **C ← B ← A (herança em cadeia)**       | ✅   | ✅     | Herança em cadeia é válida.                                                               |
| d)    | **A implementa IA**                     | ✅   | ✅     | Classes implementam interfaces com `implements`.                                          |
| e)    | **IA implementa A (ou herda classe A)** | ❌   | ❌     | Interface **não pode implementar ou estender** uma classe.                                |
| f)    | **A estende interface IA**              | ❌   | ❌     | Classes **não podem usar `extends` com interface** — deve ser `implements`.               |
| g)    | **IA estende classe B**                 | ❌   | ❌     | Interface não pode herdar de classe.                                                      |
| h)    | **IB estende IA**                       | ✅   | ✅     | Interface pode estender outra interface.                                                  |
| i)    | **IB implementa IA**                    | ❌   | ❌     | Interface **não implementa** outra — deve usar `extends`.                                 |
| j)    | **B extends A, implements IA, IB**      | ✅   | ✅     | Classe pode estender uma classe e implementar várias interfaces.                          |
| k)    | **IA implementada por A e B**           | ✅   | ✅     | Interfaces podem ser implementadas por múltiplas classes.                                 |
| l)    | **Classe herda de si mesma (A ← A)**    | ❌   | ❌     | Herança circular é proibida em qualquer linguagem.                                        |
| m)    | **Classe interna (B dentro de A)**      | ✅   | ✅     | Java permite classes internas (`inner classes`).                                          |
| n)    | **IC estende IA e IB (interfaces)**     | ✅   | ✅     | Interfaces podem estender várias interfaces: `interface IC extends IA, IB`.               |
