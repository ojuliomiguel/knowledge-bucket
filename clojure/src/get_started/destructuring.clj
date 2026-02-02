(ns get-started.destructuring)

(def cats ["Júnior" "Mingau" "Cereja" "Frajola" "Garfield" "Simba" "Luna" "Nala" "Tom" "Salem"])

(defn get-first
  [[first-thing]]
  first-thing)

(get-first cats)

(defn chooser 
  [[first, second, & choices]]
  (println (str "Your first choice is:" first))
  (println (str "Your second choice is" second))
  (println (str "We're ignoring the rest of your choices"
                (clojure.string/join ", " choices))))

(chooser cats)

