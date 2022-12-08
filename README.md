# Localibbackend
creation du back de localib


pour lancer l'application :

utiliser docker avec mongodb

aller dans le terminal lancer docker : docker compose up -d 

pour ajouter supprimer modifier : (les locataires / voitures / locations)

aller sur Postman (format json )http://localhost:8080
http://localhost:8080/voitures 
{
    
    "marque": "renault",
    "plaqueImmatriculation": "nzrgs56",
    "model": "xmas4545",
    "prix": "120000",
    "vdisponible": "Vdisponible"
}
        
http://localhost:8080/locataires
                  
 {
      
 "nom": "ndd",
 "prenom": "ddBapt4848iste",
 "dateNaissance": "1995-12-15",
 "email": "nl@gma545il.com",
 "numerosTelephone": "06ss606060606"
 }
    
http://localhost:8080/locations
{
    "dateDepart":"2000-11-08",
    "dateFin":"2000-11-10",
    "prixLocation": "120",
    "locataire":"",
    "voiture": ""
}
