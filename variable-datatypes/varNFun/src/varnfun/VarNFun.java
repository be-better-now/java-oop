/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varnfun;

/**
 *
 * @author Merlin
 */
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        playWithBooleans();
        printIntegerList();
    }
    
    //in ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void playWithBooleans() {
        //C: đúng 1, > 0, sai 0  -> int
        //Java: true, sai: false -> booleans
        boolean marriedStatus = false; 
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
    
    public static void playWithCharacters() {
        //2 bytes cho kiểu char, lưu bằng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        
        //Tên em thì sao? bên C thì là mảng các kí tự, không primitive nữa rồi
        String name = "Nguyen Huu Duy"; //loại data type mới hoàn toàn, phức tạp
                                        //phức tạp, do gom n thứ khác (gọi là object data types)
                                       
        System.out.println("My name: " + name);
        System.out.println("1s letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
        //C: string.h -> strlwr()...
        
    }
    
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        
        System.out.printf("pi: %.2f\n", pi); //cấm tuyệt đối không dùng %lf
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
        
    }
    
    public static void playWithIntegers() {
        int n = 39; //mọi con số, kí tự xuất hiện trong code được gọi là literal value
                    //số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        
        long m = 3000_000_000L; //_ phân cách literal trong code cho dễ đọc
        System.out.println("m: " + m);
        
        int status = 0xFA; //hệ 16
        System.out.println("status: " + status);
        
        int phone = 010; //số 0 đứng trước trong literal được hiểu là số hệ 8
                        //số 10 trong hệ octal (hệ 8) là số 8 trong hệ decimal (hệ 10)
        System.out.println("phone: " + phone);
        
    }
    
    //static thì chỉ chơi với static - OOP
    public static void playWithVariables() {
        //biến là một vùng RAM được đặt tên, chiếm một số bytes nhất định
        //tùy loại dữ liệu, thông tin mà nó sẽ chứa bên trong
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị (đơn hoặc phức)
        
        int age = 20;
        int a = 10, b;
        b = 100;
        //int tốn 12 bytes trong RAM, để lưu trữ những thông tin on/off trong RAM
        System.out.println("age: " + age);
        //dấu cộng dùng để nối các chuỗi lại với nhau
        
        int yearOfBirth = 2004; 
        age = 2024 - yearOfBirth;
        System.out.println("age again: " + age);
        
        System.out.println("age bye using transitive: " + (2024 - yearOfBirth));
        
        System.out.printf("age printed by using %% as in C: %d\n", (2024 - yearOfBirth));
    }
    
}
