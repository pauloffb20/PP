/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f5e1;

public class F5E1 {
    
    public static void main(String[] args) {
       Expense expense1 = new Expense(1, "Carro", 12.0f);
       Expense expense2 = new Expense(2, "Casa", 300.0f);
       Expense expense3 = new Expense(1, "Carro", 30.0f);
       Expense expense4 = new Expense(2, "Casa", 200.0f);
       Expense[] expenses1 = new Expense[]{expense1, expense2};
       Expense[] expenses2 = new Expense[]{expense3, expense4};
       User user1 = new User("paulo", "@hotmail", "18-04-1998", expenses1);
       User user2 = new User("miguel", "@gmail", "11-03-1999", expenses2);
       User[] users = new User[]{user1, user2}; 
  
        for(int i = 0 ; i < users.length; i++) {
            System.out.println(users[i].id);
            System.out.println(users[i].nome);
            for (int j = 0; j < expenses1.length; j++) {
                System.out.println("Nr de despesa :" + users[i].expenses[j].nr);
                System.out.println("valor:" + users[i].expenses[j].amount);
                System.out.println("tipo:"+ users[i].expenses[j].type);
            }
        }    
    }
}
