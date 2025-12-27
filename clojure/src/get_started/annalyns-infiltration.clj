(ns get-started.annalyns-infiltration)

(def knight-awake? true)

(defn can-fast-attack? [knight-awake?]
   (not knight-awake?))

(can-fast-attack? knight-awake?)