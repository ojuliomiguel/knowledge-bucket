(ns get-started.annalyns-infiltration)

(def knight-awake? true)

(defn can-fast-attack? [knight-awake?]
   (not knight-awake?))

(can-fast-attack? knight-awake?)

(defn can-spy? [knight-awake? archer-awake? prisoner-awake?] 
  (or knight-awake? archer-awake? prisoner-awake?))

(can-spy? true true true)

(defn can-signal-prisoner? [archer-awake? prisoner-awake?] 
  (and (not archer-awake?) prisoner-awake?))

(can-signal-prisoner? false true)

(defn can-free-prisoner? 
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (or
   (and dog-present? (not archer-awake?))
   (and (not dog-present?) prisoner-awake? (not knight-awake?) (not archer-awake?))))

(can-free-prisoner? true false false true)