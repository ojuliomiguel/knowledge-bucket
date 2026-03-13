(ns brave-clojure.loop)

(loop [iteration 0]
  (println (str "Iteration" iteration))
  (if (> iteration 7)
    (println "Goodbye")
    (recur (inc iteration))))

; Multiple arity
(defn recursive-printer
  ([]
   (recursive-printer 0))
  ([iteration]
   (println iteration)
   (if (> iteration 3)
     (println "Goodbye!")
     (recursive-printer (inc iteration)))))

(recursive-printer)
