package controllers

import javax.inject.Inject

import play.api.mvc.{AbstractController, ControllerComponents}

class MainController @Inject()(cc: ControllerComponents)
    extends AbstractController(cc) {
  def index = TODO
}
