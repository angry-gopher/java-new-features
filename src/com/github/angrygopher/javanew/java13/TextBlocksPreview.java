package com.github.angrygopher.javanew.java13;

public class TextBlocksPreview {
    public static void main(String[] args) {
        var before = "{\n" + "name: \"Jon\",\n" + "surname: \"Snow\",\n" + "age: 23,\n" + "city: \"Winterfell\"\n" + "}";

        var after = """                                           
                {       
                name: "Jon",                                                  
                surname: "Snow",                     
                age: 23,           
                city: "Winterfell"                     
                }""";
        System.out.println(before.equals(after));
    }

}
