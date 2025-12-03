(ns hello-world)

(defn greet [name]
  (str "Hello, World, " name))

(defn -main []
     (println (clojure.string/join "\n" (map greet ["Aliche", "Bobs", "Carlos"]))))