import play.api.mvc.{Action, Controller}

object AppController extends Controller {

  def ping = Action { implicit request =>
    Ok("""{"msg": "pong from scala world"}""").as("application/json")
  }
}