package com.company.entity.classes;



import java.util.ArrayList;
import java.util.Scanner;

public class UserReview {
    private GeneralAccount user;
    private String Text;
    private String status;
    ArrayList<UserReview> clientsView = new ArrayList<UserReview>();

    UserReview getInof() {
        UserReview client = new UserReview();
        // setUser(//TODO تابع لاگین ک یک جنرال اکانت برمیگرداند));
        System.out.println("please enter yor review here ");
        Scanner sc = new Scanner(System.in);
        String veiw = sc.nextLine();
        setText(veiw);
        setStatus("waiting");
        clientsView.add(client);
        return this;
    }

    public GeneralAccount getUser() {
        return user;
    }

    public void setUser(GeneralAccount user) {
        this.user = user;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}




