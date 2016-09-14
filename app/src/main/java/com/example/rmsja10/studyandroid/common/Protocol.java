package com.example.rmsja10.studyandroid.common;

/**
 * Created by rmsja10 on 2016. 9. 14..
 */
public class Protocol {

    public enum RequestType {

        Memu(1);

        private int type;

        RequestType(){

        }

        RequestType(int type){
            this.type = type;
        }

        public int getRequestType(){
            return type;
        }
    }

    public enum MenuType {

        Customer(1),
        Sales(2),
        Product(3);

        private int type;

        MenuType(){

        }

        MenuType(int type){
            this.type = type;
        }

        public int getMenuType(){
            return type;
        }
    }

    public enum ActivityType {

        Mission03(1);

        private int type;

        ActivityType(){

        }

        ActivityType(int type){
            this.type = type;
        }

        public int getActivityType(){
            return type;
        }
    }
}
