# App_Dist_TD_1
Programmes utilises: 1-IntelliJ 
                     2-mysql-connector-java-8.0.28.jar (comme executable)
                     3-MySQL Workbench, MySQL shell et MySQL server
Lien du fichier executable: https://dev.mysql.com/downloads/file/?id=509728
 
Apres avoir avoir creer le projet java, il faudra placer le fichier executable(.jar) dans un fichier lib. Ensuite, il faut utilisez la librairie sql je java avec "import java.sql.*"
nsuite ecrire le code dans la fonction main. 

1- On commence par relier notre projet java a notre base de donnees. La variable est de type "Connection", on utilise la methode "getConnection" de "DriverManager" tout en specifiant l'url de la bdd avec son nom, le username et le mot de passe.
2- Pour inserer des elements dans notre bdd, il faudra tout d'abord ecrire la requete SQL sous forme de String et en specifiant les colonnes de la bdd. 
   Ensuite en utilisant une variable de type PreparedStatement, preciser les valeurs qu'on veut inserer. A la fin, on execute les requetes en utlilisant le nom de la variable avec la methode "execute" de la classe "PreparedStatement"
3- Apres avoir inserer, si l'on veut voir le contenu de la bdd, on utilise une variable de type "Statement" et on utlise "executeQuery" ayant comme parametre la requete SQL voulu
4- le resultat de la requete doit etre stocker dans une variable de type ResultSet ou l'on pourra afficher sur notre ecran son contenu avec System.out.println et les methode getInt et getString. 





