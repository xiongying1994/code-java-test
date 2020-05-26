package old.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个  图  ，并附上一些顶点
 * 怎么去创建一个图的对象去使用
 */
public class MainTest {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        Node A = new Node();
        List listAC = new ArrayList();listAC.add(A);
        Node B = new Node(2,listAC);

        List listBD = new ArrayList();listBD.add(B);
        Node C = new Node(3,listBD);

        List listCA = new ArrayList();listCA.add(C);listCA.add(A);
        Node D = new Node(4,listCA);

        List listDB = new ArrayList();listDB.add(D);listDB.add(B);
        A.setVal(1);
        A.setNeighbors(listDB);

        listBD.add(D);
        C.setNeighbors(listBD);
        listAC.add(C);
        B.setNeighbors(listAC);

        Node result = solution2.cloneGraph(A);
        System.out.println(result);
    }
}
