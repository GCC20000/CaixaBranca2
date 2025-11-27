package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

       //Testes Rápidos
       calc.calc(2, 3, "+") ;  // Esperado: 5
       calc.calc(5, 2, "-") ;  // Esperado: 6   
       calc.calc(4, 3, "*") ;  // Esperado: 15       
       calc.calc(10, 2, "/") ; // Esperado: 4              
       calc.calc(10, 0, "/") ; // Esperado: Erro divisão por zero         
       calc.calc(7, 3, "%") ;  // Esperado: Operação inválida

     }
}