package se.britech.groovySeminarie.groovy

def lingonsylt=new Item(name:"Lingonsylt", price: 49.50 as double)
def blodpudding=new Item(name:"Blodpudding", price:9.90 as double)
cart.items = [lingonsylt, blodpudding]

println "Total price: ${cart.calcTotalPrice()}"