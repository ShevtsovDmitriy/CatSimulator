package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private static String name;

    public static void main(String[] args) {
        System.out.println("Привет, кот!");
        System.out.println("Введи своё имя!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Привет, " + name);
        System.out.println("Ты живой?");
        int life = 9;

        while (life > 0){
            if (!Answer()) {
                life--;
                if (life == 0)
                {
                    System.out.println("Ты умер окончательно! Совсем! И больше не воскреснешь! Всё! Это конец! Больше нельзя! Никак!");
                    return;
                }
                else
                    System.out.println("Поздравляю, ты умер! У тебя осталось " + life + " жизней");
            }

            System.out.println("Наверное, ты хочешь есть?");
            if (Answer()) {
                IWonnaEat();
            }

            System.out.println("Не пора ли в туалет?");
            if (Answer()) {
                INeedWC();
            }

            System.out.println("Хозяева на месте?");
            if (Answer()) {
                GoToPeople();
            }
            else {
                System.out.println("Что ж, настало время подумать, как уничтожить этих ничтожных людишек!");
            }


            System.out.println("На этом твой день и закончился, пора пойти поспать");
            System.out.println("Просыпайся!");
            System.out.println("Ты всё ещё жив?");


        }
    }

    public static boolean Answer(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("нет")) {
                return false;
            }
            if (answer.equals("да")) {
                return true;
            } else {
                System.out.println("Введи корректный ответ, да/нет?");
            }
        }
    }

    public static boolean Answer_wear(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("одежду")) {
                return false;
            }
            if (answer.equals("нас")) {
                return true;
            } else {
                System.out.println("Введи корректный ответ, нас/одежду?");
            }
        }
    }

    public static void IWonnaEat(){
        System.out.println("Посмотрим, что нам оставил хозяин. Иди на кухню.\nВ миске есть еда?");
        if (Answer()){
            System.out.println("Ты уверен, что это можно есть?");
            if (Answer()) {
                System.out.println("Ну и чего стоишь? Может, тебе ещё и приятного аппетита пожелать? Ешь давай.");
                return;
            }
            System.out.println("Что ж... Эти тапки всё равно надо было выбросить");
        }
        System.out.println("Я думаю, на столе есть еда!\nНашёл что-нибудь?");
        if (Answer()){
            System.out.println("Ты уверен, что это можно есть?");
            if (Answer()) {
                System.out.println("Ну и чего стоишь? Может, тебе ещё и приятного аппетита пожелать? Ешь давай.");
            }
            else {
                System.out.println("Что ж... Эти тапки всё равно надо было выбросить\nА тебе придётся поголодать, уж прости.");
                return;
            }
        }
        else {
            System.out.println("Что ж... Эти тапки всё равно надо было выбросить\nА тебе придётся поголодать, уж прости.");
            return;
        }
        Random rnd = new Random();
        if (rnd.nextInt(2) == 1) {
            System.out.println("Поздравляю, ты сыт");
        }
        else {
            System.out.println("Хозяин заметил, что ты был на столе!");
            System.out.println("Шея будет болеть ещё долго... А эти тапки всё равно надо было выбросить");
        }
    }

    public static void INeedWC(){
        System.out.println("Давно не ходил в тапки?");
        if(Answer()){
            System.out.println("Ну вот, отличный вариант. С облегчением!");
            return;
        }
        System.out.println("Тебе охота тащиться к лотку?");
        if (!Answer()){
            System.out.println("Может, в цветы?");
            if (Answer()){
                System.out.println("Ну вот, отличный вариант. С облегчением!");
                return;
            }
        }
        System.out.println("Придётся всё же в лоток.\nЛоток полон?");
        if(Answer()){
            System.out.println("С облегчением!");
            return;
        }
        System.out.println("Тогда ковёр!");
        Random rnd = new Random();
        if (rnd.nextInt(2) == 1) {
            System.out.println("Вроде не заметили, можно спокойно уходить.");
        }
        else {
            System.out.println("Хозяин заметил лужу на ковре!");
            System.out.println("Шея будет болеть ещё долго...");
        }
    }

    public static void GoToPeople(){
        System.out.println("Любишь хозяев?");
        if (Answer()){
            System.out.println("Улыбаемся и машем");
        }
        else {
            System.out.println("Хозяйская пятка - отличная цель!");
        }
        System.out.println("Хозяину понравилось?");
        if (Answer()) {
            System.out.println("Лежим на спине, ждём, пока погладят.");
        }
        else {
            System.out.println("Уходим, " + name + ", нас здесь не любят");
            return;
        }
        System.out.println("Гладят?");
        if (!Answer()){
            System.out.println("Уходим, " + name + ", нас здесь не любят");
        }
        else {
            System.out.println("Гладят нас или одежду?");
            if (Answer_wear())
            {
                System.out.println("Наслаждаемся");
            }
            else{
                System.out.println("Уходим, " + name + ", нас здесь не любят");
            }
        }
    }
}