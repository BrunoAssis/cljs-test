(ns tormenta-ficha-cljs.subs
  (:require
   [re-frame.core :as rf]))

(rf/reg-sub
 ::character-name
 (fn [db]
   (:character-name db)))
