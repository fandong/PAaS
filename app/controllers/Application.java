package controllers;

import models.DataItem;
import play.*;
import play.mvc.*;

import views.html.*;
import views.html.datagrid;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render(""));
    }

    public static Result getDataFromGrid() {
        return ok(datagrid.render(" > Data On Grid", DataItem.getDataFromGrid()));
    }

    public static Result savedData() {
        return TODO;
    }
}
