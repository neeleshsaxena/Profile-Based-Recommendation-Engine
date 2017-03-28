# Profile-Based-Recommendation-Engine
A recommendation engine that uses supervised learning techniques to predict user’s future trips on the basis of their past trips and preferences. Uses Microsoft Azure to implement machine learning techniques to create a user-specific profile. The recommendation system is built on deep learning (neural networks with backpropagation). 

The neural network was trained to recommend house listings which coincided with the user’s traits. 
The application itself is a Spring MVC application using MongoDB for database connectivity, deployed over web server(Apache Tomcat).
Morphia ORM was used for serializing objects in the application, through by MongoDB.
Excessive use of Javascript for pulling the JSON objects from the application (using AJAX and FasterXML/Jackson) and integrating the application UI with Google Maps API. 

1.3 million listings and user data were stored in MongoDB. 
The listings that were recommended to the users were fed into MongoDB and were displayed in the application using Google Maps API. 

Being a frequent Airbnb user myself, my wish for a more personalized experience for planning my future Airbnb trips inspired the concept behind this project. 


