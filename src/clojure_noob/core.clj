(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(def print-one
  (println 1))

(def print-a-string
  (println "a string"))

(def print-a-vector
  (println ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"]))

(def print-plus-operator
  (println (+ 1 2 3)))

(def print-str-operator
  (println (str "It was the panda " "in the library " "with a dust buster")))

(def print-if-true
  (if true
    (println "By Zeus's hammer!")
    (println "By Aquaman's trident!")))

(def print-if-false
  (if false
    (println "By Zeus's hammer!")
    (println "By Aquaman's trident!")))

(def print-omit-else-branch
  (if false
    (println "By Zeus's hammer!")))

print-one
print-a-string
print-a-vector
print-plus-operator
print-str-operator
print-if-true
print-if-false
print-omit-else-branch