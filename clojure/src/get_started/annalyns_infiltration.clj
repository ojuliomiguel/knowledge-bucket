(ns get-started.annalyns-infiltration)

(def knight-awake? true)

(defn can-fast-attack? [knight-awake?]
   (not knight-awake?))

(can-fast-attack? knight-awake?)

(knight-awake? false)
(def archer-awake? true)
(def prisoner-awake? false)

(defn can-spy? [knight-awake? archer-awake? prisoner-awake?] 
  (or knight-awake? archer-awake? prisoner-awake?))

(can-spy? knight-awake? archer-awake? prisoner-awake?)

(archer-awake? false)
(prisoner-awake? true)



