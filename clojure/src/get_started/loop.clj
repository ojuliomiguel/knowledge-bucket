(ns get-started.loop)

(loop [iteration 0]
  (println (str "Iteration" iteration))
  (if (> iteration 7)
    (println "Goodbye")
    (recur (inc iteration))))