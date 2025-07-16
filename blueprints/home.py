from flask import Blueprint, render_template, request

home_bp = Blueprint('home', __name__)

@home_bp.route("/")
def home_redirect():
    from flask import redirect
    return redirect("/home")

@home_bp.route("/home")
def home():
    return render_template("Home.html")

def handle_data():
    send_data()
    retrieve_data()

def retrieve_data():
    dwdw

def send_data():
    area = request.form['']
    MET_Weather_API = "https://api.met.no/weatherapi/dummy/0.3/precipitation?area=", area, ""