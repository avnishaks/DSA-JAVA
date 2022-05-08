package GenricTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>>  children;
    TreeNode(T data){
        this.data=data;
        this.children=new ArrayList<>();
    }
}
public class GNTreeIntro {
    public static TreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        Queue<TreeNode<Integer>> q=new LinkedList<>();
        System.out.println("Please Enter the root node");
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        TreeNode<Integer> root=new TreeNode<>(rootData);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<Integer> front=q.poll();
            System.out.println("Please Enter the number of child for : "+
                    front.data);
            int NOC=sc.nextInt();
            for(int i=0;i<NOC;i++){
                int val=i+1;
                System.out.println("Enter the "+val+" th child for the " +
                        "root ;-> "+ front.data);
                int childData=sc.nextInt();
                TreeNode<Integer> childNode=new TreeNode<>(childData);
                front.children.add(childNode);
                q.add(childNode);
            }
        }
        return root;
    }
    public  static void printTree(TreeNode<Integer> root){
        System.out.print(root.data+" : ");
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child=root.children.get(i);
            System.out.print(child.data+" ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child=root.children.get(i);
            printTree(child);
        }
    }
    public static void main(String[] args) {
        TreeNode<Integer> root=takeInput();
        printTree(root);
    }
}
