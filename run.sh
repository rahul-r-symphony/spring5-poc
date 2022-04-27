mvn clean install
rm -rf ~/symphony/spring5/webapps -y
mkdir webapps
cp orders/orders-web/target/orders.war webapps/
cp products/products-web/target/products.war webapps/
docker build -t poc .
docker run --rm -p 8080:8080 poc