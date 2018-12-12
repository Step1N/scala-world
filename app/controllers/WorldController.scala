package controllers

import play.api.mvc.{Action, Controller}

object WorldController extends Controller{

  def ping = Action { implicit request =>
    Ok("""{"msg": "pong from scala world"}""").as("application/json")
  }
}
