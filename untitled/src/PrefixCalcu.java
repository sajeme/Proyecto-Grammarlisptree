import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Arrays;

public class PrefixCalcu extends Exception{
    private Stack<String> pila=new Stack<String>();

    public Double evaluar(String exprs) {
            exprs=exprs.replaceAll("[(]", "( ").replaceAll("[)]", " )");
            String[] prefixarray = exprs.split(" ");
            if(prefixarray[0].equals("(")){
                Collections.reverse(Arrays.asList((prefixarray)));
                for(String s: prefixarray){
                    this.pila.push(s);
                }
                double resultado= parentesis();
                return resultado;
            }
            return Double.parseDouble(prefixarray[0]);
    }

    private double parentesis() {
        double t=0;
        double resultado=0;
        String elemento=pila.pop();
        if(elemento.equals("(")){
            String operador=pila.pop();
            t=Double.parseDouble(pila.pop());
            while(!pila.peek().equals(")")){
                resultado=calcPrefix(operador,t,parentesis());
            };
            return resultado;
        }else{
            return Double.parseDouble(elemento);
        }
    }

    private double calcPrefix(String operador, double t, double parentesis) {
        double ans=0;
        switch (operador) {
            case "+":
                ans = t + parentesis;
                break;
            case "-":
                ans = t - parentesis;
                break;
            case "*":
                ans = t * parentesis;
                break;
            case "/":
                ans = t / parentesis;
                break;
            default:
                break;
        }
        return ans;
    }
}
