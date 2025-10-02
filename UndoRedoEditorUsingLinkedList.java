import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class UndoRedoEditorUsingLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] ops = new String[N];

        for (int i = 0; i < N; i++) {
            ops[i] = sc.nextLine();
        }

        System.out.println(textEditor(ops));
    }

    public static String textEditor(String[] ops) {
        LinkedList<String> ll = new LinkedList<>();
        Stack<String> st = new Stack<>();

        for (String s : ops) {
            if (s.equals("UNDO")) {
                if (!ll.isEmpty()) {
                    String last = ll.removeLast();
                    st.push(last);
                }
            } else if (s.equals("REDO")) {
                if (!st.isEmpty()) {
                    String word = st.pop();
                    ll.add(word);
                }
            } else {
                ll.add(s);
                st.clear(); // clear redo history on new input
            }
        }

        if (ll.isEmpty()) {
            return "EMPTY";
        }

        return String.join("", ll);
    }
}
