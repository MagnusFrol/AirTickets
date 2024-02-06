package ru.demo;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("c:/tickets.json"));
        JSONObject jo = (JSONObject) obj;
        JSONArray ticketsArr = (JSONArray) jo.get("tickets");
        Iterator ticketsItr = ticketsArr.iterator();
        System.out.println("tickets:");

        while (ticketsItr.hasNext()) {
            JSONObject test = (JSONObject) ticketsItr.next();
            System.out.println("- tickets: " + test.get("departure_time") );

