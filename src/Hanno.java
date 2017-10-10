import java.util.Iterator;
import java.util.Stack;

public class Hanno {

    boolean isDrawEnable = true;
    int count;
    Stack<Integer> a,b,c;

    public Hanno(){
        count=0;
    }

    public void start(int n,boolean isDrawEnable){
        this.isDrawEnable = isDrawEnable;
        start(n);
    }

    public void start(int n){
        this.a = new Stack<>();
        this.b = new Stack<>();
        this.c = new Stack<>();
        for (int i = 0; i < n; i++) {
            this.a.push(n-i);
        }
        this.hanno(n,'a','b','c');
    }

    private void hanno(int n,char a,char b,char c){

        if(n==1){
            move(a,c);
        }
        else {
            hanno(n-1,a,c,b);
            move(a,c);
            hanno(n-1,b,a,c);
        }
    }

    private void move(char from, char to){
        Stack<Integer> stackFrom = getStack(from);
        Stack<Integer> stackTo = getStack(to);
        count++;
        System.out.println(count + ".move "+ from + " to " + to);
        stackTo.push(stackFrom.pop());
        if(isDrawEnable) {
            this.drawGraphic();
        }
    }

    private Stack<Integer> getStack(char from) {
        switch (from){
            case 'a':
                return this.a;
            case 'b':
                return this.b;
            case 'c':
                return this.c;
            default :
                return null;

        }
    }

    private void drawGraphic() {
        Iterator<Integer> aIt = a.iterator();
        Iterator<Integer> bIt = b.iterator();
        Iterator<Integer> cIt = c.iterator();
        while (aIt.hasNext()||bIt.hasNext()||cIt.hasNext()){
            Integer a=null,
                    b=null,
                    c=null;
            if(aIt.hasNext())a = aIt.next();
            if(bIt.hasNext())b = bIt.next();
            if(cIt.hasNext())c = cIt.next();
            draw(a,b,c);
        }
    }

    private void draw(Integer a,Integer b,Integer c){
        if (a!=null){
            System.out.print(a);
        }
        System.out.print("\t|");
        if (b!=null){
            System.out.print(b);
        }
        System.out.print("\t|");
        if (c!=null){
            System.out.print(c);
        }
        System.out.print("\n");
    }
}

