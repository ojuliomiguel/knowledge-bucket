(ns brave-clojure.first-steps-hello-world)

(defn greet [name]
  (str "Hello, " name))

(defn -main []
  (println (clojure.string/join "\n" (map greet ["Alice" "Bob" "Carlos"]))))
