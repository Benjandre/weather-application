from flask import Blueprint, render_template

home_bp = Blueprint('home', __name__)

@home_bp.route("/")
def home_redirect():
    from flask import redirect
    return redirect("/home")

@home_bp.route("/home")
def home():
    return render_template("Home.html")
