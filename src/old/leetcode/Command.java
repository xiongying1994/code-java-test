package old.leetcode;


import java.util.*;

/**
 * 图 的 使用
 *
 */
public class Command {
    public static void main(String[] args) {
        Node A = new Node();
        List listA = new ArrayList();
        listA.add(A);
        Node B = new Node(2,listA);

        List listB = new ArrayList();
        listB.add(B);
        A.setNeighbors(listB);
        A.setVal(1);

        Iterator iterable = listA.iterator();
        while(iterable.hasNext()){

        }

        Map map = new HashMap<>(2);
        Set<Map.Entry> entrySet = map.entrySet();

        Iterator iterator2 = entrySet.iterator();
        while(iterator2.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator2.next();
        }



        Command command = new Command();
        try {
            command.nodeList(A);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private void nodeList(Node node) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(node.val);
        for(Node neig : node.neighbors){
            nodeList(neig);
        }
    }
}
