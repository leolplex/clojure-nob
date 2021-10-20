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

(defn error-message
  [severity]
  (println (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!"))))

(defn no-params
  []
  "I take no parameters!")
(defn one-param
  [x]
  (str "I take one parameter: " x))
(defn two-params
  [x y]
  (str "Two parameters! That's nothing! Pah! I will smoosh them "
  "together to spite you! " x y))

print-one
print-a-string
print-a-vector
print-plus-operator
print-str-operator
print-if-true
print-if-false
print-omit-else-branch
(error-message :mild)
(error-message :diff)