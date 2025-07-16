from flask import Flask
from blueprints.home import home_bp
from blueprints.about import about_bp

# Create Flask app with standard template and static folders
app = Flask(__name__)

# Register blueprints
app.register_blueprint(home_bp)
app.register_blueprint(about_bp)

if __name__ == "__main__":
    app.run(host="localhost", port=5000, debug=True)