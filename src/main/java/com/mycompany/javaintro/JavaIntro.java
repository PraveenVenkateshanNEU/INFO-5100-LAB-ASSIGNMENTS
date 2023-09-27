/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaintro;
import java.util.*;
/**
 *
 * @author Admin
 */
public class JavaIntro {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList> ListOfList = new ArrayList<ArrayList>();
        for(int i=0; i<n; i++){
            int d=sc.nextInt();
            ArrayList<Integer> List = new ArrayList<Integer>();
            for(int j=0; j<d; j++){
                List.add(sc.nextInt());
            }
            ListOfList.add(List);
        }
        int q=sc.nextInt();
        for(int k=0; k<q; k++){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            if(x<ListOfList.size() && y<ListOfList.get(x).size()){
                System.out.println(ListOfList.get(x).get(y));
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}
