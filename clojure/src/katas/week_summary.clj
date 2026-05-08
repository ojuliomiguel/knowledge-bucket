(ns katas.week-summary)

(def week 
  {:days ["mon" "tue" "wed" "thu" "fri" "sat" "sun"]
   :birds [0 2 5 3 7 8 4]})

(defn week_summary
  [{:keys [days birds]}]
  (reduce + birds))

(week_summary week)