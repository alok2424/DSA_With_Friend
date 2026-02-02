// 1)Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// 2)All occurrences of a character must be replaced with another character while preserving the order of characters.
// 3) No two characters may map to the same character, but a character may map to itself.
class Solution {
      // Method to check if two strings are isomorphic
      public boolean isomorphicString(String s, String t) {
          // Arrays to track last seen positions of characters in s and t
          int[] m1 = new int[256], m2 = new int[256];
  
          // Get length of the strings
          int n = s.length();
  
          // Loop through all characters in the strings
          for (int i = 0; i < n; ++i) {
              // Return false if mapping is inconsistent
              if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
  
              // Update last seen index for both characters
              m1[s.charAt(i)] = i + 1;
              m2[t.charAt(i)] = i + 1;
          }
  
          // Return true if all character mappings are consistent
          return true;
      }
  }