package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@RestController
public class TodoController {

    @GetMapping("/")
      public String getTodoById() throws IOException {
          Retrofit retrofit = new Retrofit.Builder()
                  .baseUrl("https://jsonplaceholder.typicode.com/")
                  .addConverterFactory(GsonConverterFactory.create())
                  .build();

          //Creates a class which implements the TodoService interface at runtime
          TodoService todoService = retrofit.create(TodoService.class);

          Todo t = todoService.getTodoById("1").execute().body();
          assert t != null;
          return t.toString();
      }
}
