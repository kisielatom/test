# springtest

Réponse question :

1) library/book
2) book[@roman]/title
3) count(book[@bd])
4) ça va renvoyer tout le xml

API DOC

CREATE DATABASE personne;

http://localhost:8080/api/v1/personne renvoie la liste des personnes triées par ordre alphabétique

curl --request POST \
  --url http://localhost:8080/api/v1/personne \
  --header 'Authorization: Basic cG9zdGdyZXM6dG9tdG9t' \
  --header 'Content-Type: application/json' \
  --data '{
	"nom": "Kisiela",
	"prenom": "Tom",
	"dob": "1997-03-06"
}'