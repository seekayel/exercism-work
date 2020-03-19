(ns reverse-string)

;; (require '[clojure.string :as string])

(defn reverse-string
  ([] (str ""))
  ([s]
   (if (= s "")
     (str "")
     (apply
       str (reverse-string (apply str (rest s))) (str (first s))))))
