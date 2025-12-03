(ns hello-world)

(defn greet [name]
  (str "Hello, World, " name))

(defn -main []
     (println (map greet ["Aliche", "Bobs", "Carlos"])))