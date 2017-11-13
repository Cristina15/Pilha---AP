package exemplopilha;

public class TestePIlha {

    public static void main(String[] args) {

        Object a = 5, b = 7, c = 2;
        Pilha p = new Pilha();
        // Atribuindo os valores na pilha
        p.push(a);
        p.push(b);
        p.push(c);
        // criou o y que vale o c-b; tirou o c, e somou o b; inútil
        Object y = (int) p.pop()+ (int) b;
       // olhando só o que tem na pilha, e mostra
        Object z = (int) p.top();
        
        p.push((int) a + (int ) z);
        // retira o elemento
        p.pop();
        
        p.push((int) b + (int) z); 
        
        while (!p.isEmpty()) {
            int x = (int) p.pop();
            System.out.print(x + " ");
        }
    }

}
